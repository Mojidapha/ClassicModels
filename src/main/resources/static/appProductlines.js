$( document ).ready(function(){
	console.log("ready!");
	getAllProductlines(0, 20, 'G')
});

function getAllProductlines(page, size, rating){
	$.ajax({
		url: '/classicmodels/api/allProductlines', 
		type: "get",
		dataType: "json",

		success: function(data, textStatus, jqXHR){
			console.log(data);

		}
	});
}

