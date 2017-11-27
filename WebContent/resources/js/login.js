$(document).ready(function(){
	if($('#idLogin').indexOf("@")>-1){
		$('#formLogin').submit(function(){
			$.each(params, function(i, param){
				$('<input/>').attr('type','hidden')
				.attr('name','cli')
				.attr('value','cli')
				.appendTo('#idLogin');
			})
			return true;
		})
	}else{
		$('#formLogin').submit(function(){
			$.each(params, function(i, param){
				$('<input/>').attr('type','hidden')
				.attr('name','adm')
				.attr('value','adm')
				.appendTo('#idLogin');
			})
			return true;
		})
	}
})