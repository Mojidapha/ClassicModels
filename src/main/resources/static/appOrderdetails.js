$( document ).ready(function(){
	console.log("ready!");
	getAllOrderdetails(0, 20, 'G')
});

function getAllOrderdetails(page, size, rating){
	$.ajax({
		url: '/classicmodels/api/allOrderdetails', 
		type: "get",
		dataType: "json",

		success: function(data, textStatus, jqXHR){
			console.log(data);

		}
	});
}

