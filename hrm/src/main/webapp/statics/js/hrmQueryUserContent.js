function deleteUser(id){
	$.post("/user/deleteUserById",{"userId":id});
}