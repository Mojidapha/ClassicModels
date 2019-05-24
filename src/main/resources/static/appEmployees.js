$( document ).ready(function(){
	console.log("ready!");
	getAllFilm(0, 20, 'G')
});

function getAllFilm(page, size, rating){
	$.ajax({
		url: '/classicmodels/api/allEmployees', 
		type: "get",
		dataType: "json",

		success: function(data, textStatus, jqXHR){
			console.log(data);

		}
	});
}

