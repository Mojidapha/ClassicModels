$( document ).ready(function(){
	console.log("ready!");
	getAllProducts(0, 20, 'G')
});

function getAllProducts(page, size, rating){
	$.ajax({
		url: '/classicmodels/api/allProducts', 
		type: "get",
		dataType: "json",

		success: function(data, textStatus, jqXHR){
			console.log(data);

		}
	});
}

