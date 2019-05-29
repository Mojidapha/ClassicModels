$( document ).ready(function(){
	console.log("ready!");
	getAllEmployees(0, 20, 'G')
});

function getAllEmployees(page, size, rating){
	$.ajax({
		url: '/classicmodels/api/allEmployees', 
		type: "get",
		dataType: "json",

		success: function(data, textStatus, jqXHR){
			console.log(data);

		}
	});
}

