$( document ).ready(function(){
	console.log("ready!");
	getAllOrders(0, 20, 'G')
});

function getAllOrders(page, size, rating){
	$.ajax({
		url: '/classicmodels/api/allOrders', 
		type: "get",
		dataType: "json",

		success: function(data, textStatus, jqXHR){
			console.log(data);

		}
	});
}

