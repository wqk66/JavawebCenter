//У�������ʽ
function checkEmail(value){
	var patt = /([\w-])+@[\w-]{2,}\.[\w]{2,4}/;
	if(value!="" || value!=null){
		if(patt.exec(value)!=null){
			return true;
		}else{
			alert("�����ʽ����ȷ��");
			return;
		}
	}
	
}