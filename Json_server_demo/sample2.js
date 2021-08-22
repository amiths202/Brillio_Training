document.addEventListener('DOMContentLoaded', () => {

	document.getElementById('insertBtn').addEventListener('click', async (e) => {
		const id = document.getElementById('insertEmpID').value;
		const projectName = document.getElementById('insertProject').value;
		if (id === '' || projectName === '') {
			alert('Please enter all details!');
		}
		else {
			const dept = {
				"id": id,
				"projectName": projectName
			}
			try {
				const response = await fetch('http://localhost:8000/db', {
					method: 'POST',
					headers: {
						'Content-Type': 'application/json'
					},
					body: JSON.stringify(dept)
				});
				alert("Student successfully added")
			}
			catch (err) {
				console.error(err);
			}
		}
	});

	
    document.getElementById('updateBtn').addEventListener('click', async (e) => {
		const id = document.getElementById('updateEmpID').value;
		const projectName = document.getElementById('updateProject').value;
		if (id === '' || projectName === '') {
			alert('Please enter all details!');
		}
		else {
			const dept = {
				"id": id,
				"projectName": projectName,

			}
			try {
				const response = await fetch(`http://localhost:8000/db/${id}`, {
					method: 'PUT',
					headers: {
						'Content-Type': 'application/json'
					},
					body: JSON.stringify(dept)
				});
				if (response.status === 404) {
					alert('The requested Employee ID was not found!')
				}
                alert("Updated successfully")
			}
			catch (err) {
				console.error(err);
			}
		}
	});


	document.getElementById('show').addEventListener('click', async (e) => {
		try {
			const response = await fetch('http://localhost:8000/db');
			const data = await response.json();
			const dept = data.db;
			const parent = document.getElementById('showAll');
			while (parent.hasChildNodes()) {
				parent.removeChild(parent.firstChild);
			}
			dept.forEach(item => {
				console.log(item);
				const text1 = document.createElement('h5');
				text1.classList.add('title', 'is-5');
				text1.innerHTML = `ID: ${item.id}`;
				parent.appendChild(text1);
				const text2 = document.createElement('h5');
				text2.classList.add('title', 'is-5');
				text2.innerHTML = `Project Name: ${item.projectName}`;
				parent.appendChild(text2);
				const breaker = document.createElement('br');
				parent.appendChild(breaker);
			});
		}
		catch (err) {
			console.error(err);
		}
	});

	

	document.getElementById('deleteBtn').addEventListener('click', async (e) => {
		const id = document.getElementById('deleteEmpID').value;
		if (id === '') {
			alert('Please enter all details!');
		}
		try {
			const response = await fetch(`http://localhost:8000/db/${id}`, {
				method: 'DELETE'
			});
		}
		catch (err) {
			console.error(err);
		}
	});

});