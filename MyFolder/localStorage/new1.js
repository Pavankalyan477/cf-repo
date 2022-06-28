
//let id = ""
//let users_record = [];
//localStorage.setItem("users",JSON.stringify([{Name:"sonu",Email:"sonu@gmail.com"}]))

selectData();

let id = "upd"


// Update and add data

function manageData(){
    


	
		let name = document.getElementById("name").value;
		let mail = document.getElementById("email").value;
		let phone = document.getElementById("phone").value;
		let designation = document.getElementById("designation").value;

		let details ={
			Name:name,
			Email:mail,
			Mno:phone,
			Designation:designation
			//Password:pass
		};

		// Form validation
	if(validateForm(details))
	{	
		// Add data
		if(id==="upd"){

			let arr=getUserData();
			
			arr.push(details);
			
			setUserData(arr);

		}

		// Update data
		else{

			let arr = getUserData();

			arr[id] = details;

			setUserData(arr);


		}
		
		// After addition or updation Empty the input field	
		document.getElementById('msg').innerHTML='Data added';
		document.getElementById('name').value = "";
		document.getElementById('email').value = "";
		document.getElementById('phone').value = "";
		document.getElementById('designation').value = "";

		// After updation and addition of data again calling show method to display updated data on table
		selectData();

	}
		
	}


	// Displaying data on table
	function selectData(){

		let arr = JSON.parse(localStorage.getItem("users"));

		if(arr!=null){

			let html = '';
			let s_no = 1;

			// Iterating over local data store array
			for( let k in arr){

				// setting each data to its corresponding section
				html=html+`<tr> <td> ${s_no} </td> <td> ${arr[k].Name} </td> <td> ${arr[k].Email} </td><td> ${arr[k].Mno} </td>
								<td> ${arr[k].Designation} </td>
								<td> <a href="javascript:void(0)" onclick="deleteData(${k})">Delete</a></td>
								<td> <a href="javascript:void(0)" onclick="editData(${k})">Edit</a></td></tr>`;
				s_no++;
			}
		
			document.getElementById("root").innerHTML = html;
    }
}


// Delete particular indexed data from localstore
function deleteData(rid){
	let arr=getUserData();
	arr.splice(rid,1);
	setUserData(arr);
	selectData();
}


// Edit data......set particular index data on text view on HTML
function editData(rid){
	id=rid;
	let arr=getUserData();
	document.getElementById('name').value=arr[rid].Name;
	document.getElementById('email').value=arr[rid].Email;
	document.getElementById('phone').value=arr[rid].Mno;
	document.getElementById('designation').value=arr[rid].Designation;
}


// Getting data from Localstore
function getUserData(){
	let arr=JSON.parse(localStorage.getItem('users'));
	return arr;
}


// Setting data to the local Store
function setUserData(arr){
	localStorage.setItem('users',JSON.stringify(arr));
}






// Validate all the required field
function validateForm(details){

	let name = document.getElementById("name").value;
	let mail = document.getElementById("email").value;
	let phone = document.getElementById("phone").value;
	let designation = document.getElementById("designation").value;

	let arr = getUserData();

	// Checking Empty field
	if(name==="" || mail==="" || phone==="" || designation===""){

		alert("All fields mandatory");
		return false;
	}


	//Phone validation
	if(validatePhone(phone))
		return false;


	// // Checking duplicate element 
	if(arr.some(details => details.Name===name)  || arr.some(details => details.Email===mail))
	{
		alert("dumplicate value not allowed");
		return false;
	}



	return true;
	
}


// Phone Validation
function validatePhone(phone){

	// checking No is Numeric or not
	if(isNaN(phone)){

		alert("No should be numerinc value");
		return true;
	}
		
	
	if(phone.length!=10){

		alert("Enter 10 digit no");
		return true;
	}
		

	return false;
}


