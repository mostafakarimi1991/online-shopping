$(function(){
	
	//Solving the active menue problem
	switch(menu){
		case 'About Us':
			$('#about').addClass('active');
			break;
		case 'Contact Us':
			$('#contact').addClass('active');
			break;
		case 'Contact Us':
			$('#contact').addClass('active');
			break;
		case 'All Products':
			$('#listProducts').addClass('active');
			break;
		default:
			$('#View Products').addClass('active');
			$('#a_'+menu).addClass('active');
			break;
	}
	
});