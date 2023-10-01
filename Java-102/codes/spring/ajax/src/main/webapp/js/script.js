var xhr;
function getEmployeeDetails(eno){
	//alert(eno)
	xhr = new XMLHttpRequest();
	xhr.open("GET", "search?empno="+eno, true);
	xhr.onreadystatechange = stateChanged;
	xhr.send();
}

function stateChanged(){
	var ename = "NO MATCH";
	var esal = "NO MATCH";
	
	if(xhr.readyState == 4 && xhr.status==200){
		var responseData = xhr.responseText;
		
		if(responseData.length > 0){
			var responseObject = JSON.parse(responseData);
			ename = responseObject.emp_name;
			esal = responseObject.emp_sal
		}			
	}
	document.getElementById("empname").innerHTML = ename;
	document.getElementById("empsal").innerText = esal;
}