let rootUrl="http://localhost:8081/wines";

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
	let list=data;
	$.each(list, function(index, wine){
		$('#table_body').append('<tr><td>'+wine.name+'</td><td>'+wine.grapes+'</td><td>'+wine.country+'</td><td>'+wine.year+'</td></tr>');
	});
	$('#table_id').DataTable();
}

$(document).ready(function(){
	findAll();
});