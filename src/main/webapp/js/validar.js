function validarPass(){
	var password1 = document.getElementById("password").value ;
	var password2 = document.getElementById("confirma_password").value ;
		
	if(password1==password2){
		submit.disabled = false;
		return true;}
	else{ 
		submit.disabled = true;
		document.getElementByClassName("error").innerHTML = "Las contraseñas no coinciden";
		return false;
	}
}