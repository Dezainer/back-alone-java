$(document).ready(function () {
	
	//HUD Content class resize
	var astronaut = $('#astronaut').width();
	var brief = $('.brief').width();

	var briefPad = $('.brief').css('padding-left');
	briefPad = briefPad.split("px");
	briefPad = parseFloat(briefPad[0]);

	var briefMar = $('.brief').css('margin-left');
	briefMar = briefMar.split("px");
	briefMar = parseFloat(briefMar[0]);

	var container = $('.container').width();

	restSize = container - astronaut - brief - briefPad * 2 - briefMar - 1;
	$('.content').css('width', restSize);


	//Planet Inf Animation
	$('.planet').click(function (e) {
		e.stopPropagation();
		$(this).find('.inf').css('opacity', 1);

		$('.planet').css('-webkit-filter', 'unset');

		$('.planet').not(this).each(function () {
			$(this).css('-webkit-filter', 'blur(2px)');
		})
	})

	$('.universe').click(function () {
		$('.inf').css('opacity', 0);
		$('.planet').css('-webkit-filter', 'unset');
	});

	$('.planet').mouseenter(function () {
		$('.planet').not(this).css('opacity', 0.5);
	});
	$('.planet').mouseleave(function () {
		$('.planet').css('opacity', 1);
	})

	//Menu Tabs
	$('.menu li').click(function () {
		var id = $(this)[0].id;
		
		$('.menu li').removeClass('active');
		$('#'+id).addClass('active');

		$('.tab').hide();
		$('.'+id).show();
	})
})