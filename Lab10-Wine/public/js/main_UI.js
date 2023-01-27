let rootUrl="http://localhost:8081/wines";
let currentWine;

findAll=function() {
	console.log("findall");
	$.ajax({
		type: 'GET',
		url: rootUrl,
		dataType: "json",
		success: renderList
	});
};

renderList=function(data) {
	var list=data == null ? [] : (data instanceof Array ? data : [data]);
	$('#wineList li').remove();
	$.each(list, function(index, wine){
		$('#wineList').append('<li><a href="#" id="' + +wine.id +'">'+wine.name+'</a></li>');
	});
};

$('#btnDelete').hide();

$(document).on("click", "#wineList a", function(){findById(this.id);});

renderDetails=function(wine){
	$('#wineId').val(wine.id);
	$('#name').val(wine.name);
	$('#grapes').val(wine.grapes);
	$('#country').val(wine.country);
	$('#region').val(wine.region);
	$('#year').val(wine.year);
	$('#pic').attr('src','images/'+wine.picture);
	$('#desciption').val(wine.desciption);
}

findById=function(id){
	console.log('findById: ' + id);
	$.ajax({
		type: 'GET',
		url: rootUrl + '/' + id,
		dataType: "json",
		success: function(data) {
			$('#btnDelete').show();
			console.log('findById success: ' + data.name);
			currentWine = data;
			renderDetails(currentWine);
		}
	})
}

$(document).on("click", "#btnAdd", function(){newWine();});

resetForm=function(){
	$('#wineId').val("");
	$('#name').val("");
	$('#grapes').val("");
	$('#country').val("");
	$('#region').val("");
	$('#year').val("");
	$('#pic').attr('src',"");
	$('#description').val("");
}

newWine=function(){
	console.log("New Wine!");
	$('#btnDelete').hide();
	resetForm();
}


formToJSON=function(){
	var wineId = $('#wineId').val();
	return JSON.stringify({
		"id": wineId == "" ? null : wineId,
		"name": $('#name').val(),
		"grapes": $('#grapes').val(),
		"country": $('#country').val(),
		"region": $('#region').val(),
		"year": $('#year').val(),
		"picture": "generic.jpg",
		"description": $('#description').val(),
		
	});
};

addWine = function(){
	console.log('addWine');
	$.ajax({
		type: 'POST',
		contentType: 'application/json',
		url: rootUrl + '/',
		dataType: "json",
		data: formToJSON(),
		success: function(data, textStatus, jqXHR) {
			alert("Wine made!!");
			$('#btnDelete').show();
			$('#wineId').val(data.id);
			findAll();
		},
		error: function(jqXHR, textStatus, errorThrown) {
			alert('addWine error: ' + textStatus);
		}
	})
}


$(document).on('click', '#btnSave', function(){
	if ($('#wineId').val()=='') {
		addWine();
		return false;
	} else {
		updateWine();
		return false;
	}
})

updateWine=function(){
	console.log('updateWine');
	$.ajax({
		type: 'PUT',
		contentType: 'application/json',
		url: rootUrl + '/' +$('#wineId').val(),
		dataType: "json",
		data: formToJSON(),
		success: function(data, textStatus, jqXHR) {
			alert('Wine updated successfully');
			findAll();
			
		},
		error: function(jqXHR, textStatus, errorThrown) {
			alert('updateWune error: ' + textStatus);
		}
		
	})
	
}


$(document).on("click", "#btnDelete", function(){
	deleteWine();
	return false;
});

deleteWine=function(){
	console.log('deleteWine');
	$.ajax({
		type: 'DELETE',
		url: rootUrl + '/' + $('#wineId').val(),
		success: function(data, testStatus, jqXHR){
			alert('Wine deleted successfully');
			resetForm();
			findAll();
		},
		error: function(jqXHR, textStatus, errorThrown){
			alert('deleteWine error');
		}
	})
}

$(document).on("click", "#btnSearch", function(){
	search($('#searchKey').val());
	return false;
});

$(document).on('keypress', '#searchKey', function(e){
	if(e.which==13){
		search($('#searchKey').val());
		return false;
	}
});

search=function(searchKey){
	resetForm();
	if (searchKey=='')
		findAll();
	else
		findByName(searchKey);
}

findByName = function(searchKey){
	console.log('findByName: ' + searchKey+ '\tRESTful: ' + rootUrl + '/mame/' + searchKey);
	$.ajax({
		type: 'GET',
		url: rootUrl + '/name/' + searchKey,
		dataType: "json",
		success: renderList
	});
}


$(document).ready(function(){
	findAll();
});