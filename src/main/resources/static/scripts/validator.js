function validator(){
	var flag=false;
	var user=form.user.value;
	var pass=form.pass.value;
	if(user==null||pass==null||user==''|pass=='')
		{
		document.getElementById('usrErrMsg').innerHTML="Empty User or Pass";
		return false;

		}
	
}