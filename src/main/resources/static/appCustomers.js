$( document ).ready(function(){
	console.log("ready!");
	getAllCustomers(0, 20, 'G')
});

function getAllCustomers(page, size, rating){
	$.ajax({
		url: '/classicmodels/api/allCustomers', 
		type: "get",
		dataType: "json",

		success: function(data, textStatus, jqXHR){
			console.log(data);

		}
	});
}

