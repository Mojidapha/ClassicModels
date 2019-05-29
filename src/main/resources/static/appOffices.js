$( document ).ready(function(){
	console.log("ready!");
	getAllOffices(0, 20, 'G')
});

function getAllOffices(page, size, rating){
	$.ajax({
		url: '/classicmodels/api/allOffices', 
		type: "get",
		dataType: "json",

		success: function(data, textStatus, jqXHR){
			console.log(data);

		}
	});
}

