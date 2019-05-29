$( document ).ready(function(){
	console.log("ready!");
	getAllPayments(0, 20, 'G')
});

function getAllPayments(page, size, rating){
	$.ajax({
		url: '/classicmodels/api/allPayments', 
		type: "get",
		dataType: "json",

		success: function(data, textStatus, jqXHR){
			console.log(data);

		}
	});
}

