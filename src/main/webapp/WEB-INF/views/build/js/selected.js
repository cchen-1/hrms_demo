//$(
//function()
//{

	function getSelected()
	{
		var selectedList = document.getElementsByClassName('icheckbox_flat-green checked');
		if(selectedList.length == 0)return null;
		else return selectedList;
	}

	function depDelete()
	{
		var selectedList = document.getElementsByClassName('icheckbox_flat-green checked');
		console.log(selectedList.length);
		if(selectedList.length == 0)return;//一个也没选中
		
		deleteStr = "";
		for (var i = selectedList.length - 1; i >= 0; i--) {
			console.log(selectedList[i].parentElement.id);
			deleteStr += selectedList[i].parentElement.id +",";
		}
		
		console.log(deleteStr);
		window.location.href="/hrms_demo/Department/delDept"+"?deleteStr="+deleteStr
	}

	function depEdit()
	{
		var selectedList = document.getElementsByClassName('icheckbox_flat-green checked');
		if(selectedList.length == 0)return;//一个也没选中

		var oneRecord = selectedList[0].parentNode.parentNode
		console.log(oneRecord.childNodes[1].id);//选中的编号

		console.log(oneRecord);//父节点，可遍历每条记录
		for (var i = oneRecord.childNodes.length - 1; i >= 0; i--) {
			console.log(oneRecord.childNodes[i]);
		}

		document.getElementById("editDeptId").value = oneRecord.childNodes[1].id;
		document.getElementById("editDeptNo").value = oneRecord.childNodes[3].innerHTML;
		document.getElementById("editDeptName").value = oneRecord.childNodes[5].innerHTML;
		document.getElementById("editRemark").value = oneRecord.childNodes[7].innerHTML;
	}

	//
	function posDelete()
	{
		var selectedList = getSelected();
		if(selectedList == null)return;

		deleteStr = "";

		for (var i = selectedList.length - 1; i >= 0; i--) {
			console.log(selectedList[i].parentElement.id);
			deleteStr += selectedList[i].parentElement.id +",";
		}
		window.location.href="/hrms_demo/DepartmentPost/delPost"+"?deleteStr="+deleteStr
	}

	function posEdit()
	{
		var selectedList = document.getElementsByClassName('icheckbox_flat-green checked');
		if(selectedList.length == 0)return;//一个也没选中

		var oneRecord = selectedList[0].parentNode.parentNode
		console.log(oneRecord.childNodes[1].id);//选中的编号
		console.log(oneRecord);//父节点，可遍历每条记录
		for (var i = oneRecord.childNodes.length - 1; i >= 0; i--) {
			console.log(oneRecord.childNodes[i]);
		}

		//console.log	(oneRecord.childNodes);
		document.getElementById("editPosId").value = oneRecord.childNodes[1].id;
		document.getElementById("editPosNo").value = oneRecord.childNodes[3].innerHTML;
		document.getElementById("editDeptNo").value = oneRecord.childNodes[5].innerHTML;
		document.getElementById("editPosName").value = oneRecord.childNodes[7].innerHTML;
		document.getElementById("editPosSalary").value = oneRecord.childNodes[9].innerHTML;
		document.getElementById("editRemark").value = oneRecord.childNodes[11].innerHTML;
	}

	//
	function recruitDelete()
	{
		var selectedList = getSelected();
		if(selectedList == null)return;

		deleteStr = "";

		for (var i = selectedList.length - 1; i >= 0; i--) {
			console.log(selectedList[i].parentElement.id);
			deleteStr += selectedList[i].parentElement.id +",";
		}
		window.location.href="/hrms_demo/Recruit/delRecruit"+"?deleteStr="+deleteStr
	}

	function recruitEdit()
	{
		var selectedList = document.getElementsByClassName('icheckbox_flat-green checked');
		if(selectedList.length == 0)return;//一个也没选中

		var oneRecord = selectedList[0].parentNode.parentNode
		console.log(oneRecord.childNodes[1].id);//选中的编号
		console.log(oneRecord);//父节点，可遍历每条记录
		for (var i = oneRecord.childNodes.length - 1; i >= 0; i--) {
			console.log(oneRecord.childNodes[i]);
		}

		//console.log	(oneRecord.childNodes);
		document.getElementById("editRecruitId").value = oneRecord.childNodes[1].id;
		document.getElementById("editTitle").value = oneRecord.childNodes[3].innerHTML;
		document.getElementById("editPosName").value = oneRecord.childNodes[5].innerHTML;
		document.getElementById("editNumber").value = oneRecord.childNodes[7].innerHTML;
		document.getElementById("editpublishDate").value = oneRecord.childNodes[9].innerHTML;
		document.getElementById("editEndDate").value = oneRecord.childNodes[11].innerHTML;
	}

	function employDelete()
	{
		var selectedList = getSelected();
		if(selectedList == null)return;

		deleteStr = "";

		for (var i = selectedList.length - 1; i >= 0; i--) {
			console.log(selectedList[i].parentElement.id);
			deleteStr += selectedList[i].parentElement.id +",";
		}
		window.location.href="/hrms_demo/Employment/delEmployment"+"?deleteStr="+deleteStr
	}

	function employEdit()
	{
		var selectedList = document.getElementsByClassName('icheckbox_flat-green checked');
		if(selectedList.length == 0)return;//一个也没选中

		var oneRecord = selectedList[0].parentNode.parentNode
		console.log(oneRecord.childNodes[1].id);//选中的编号
		console.log(oneRecord);//父节点，可遍历每条记录
		for (var i = oneRecord.childNodes.length - 1; i >= 0; i--) {
			console.log(oneRecord.childNodes[i]);
		}

		//console.log	(oneRecord.childNodes);
		document.getElementById("editEmploymentId").value = oneRecord.childNodes[1].id;
		document.getElementById("editName").value = oneRecord.childNodes[3].innerHTML;
		//document.getElementById("sex").value = oneRecord.childNodes[5].innerHTML;
		document.getElementById("editEmploymentType").value = oneRecord.childNodes[7].innerHTML;
		document.getElementById("editEmploymentPost").value = oneRecord.childNodes[9].innerHTML;
		document.getElementById("editStatus").value = oneRecord.childNodes[11].innerHTML;
		document.getElementById("editComment").value = oneRecord.childNodes[13].innerHTML;
		document.getElementById("editEmploymentResult").value = oneRecord.childNodes[15].innerHTML;
		document.getElementById("editRemark").value = oneRecord.childNodes[17].innerHTML;
	}

	function welfareConfEdit()
	{
		var selectedList = document.getElementsByClassName('icheckbox_flat-green checked');
		if(selectedList.length == 0)return;//一个也没选中

		var oneRecord = selectedList[0].parentNode.parentNode
		console.log(oneRecord.childNodes[1].id);//选中的编号
		console.log(oneRecord);//父节点，可遍历每条记录
		for (var i = oneRecord.childNodes.length - 1; i >= 0; i--) {
			console.log(oneRecord.childNodes[i]);
		}

		//console.log	(oneRecord.childNodes);
		document.getElementById("edit-staffWelfareId").value = oneRecord.childNodes[1].id;
		document.getElementById("edit-staffNo").value = oneRecord.childNodes[3].innerHTML;
		document.getElementById("edit-pension").value = oneRecord.childNodes[5].innerHTML;
		document.getElementById("edit-unemployment").value = oneRecord.childNodes[7].innerHTML;
		document.getElementById("edit-medical").value = oneRecord.childNodes[9].innerHTML;
		document.getElementById("edit-birth").value = oneRecord.childNodes[11].innerHTML;
		document.getElementById("edit-injury").value = oneRecord.childNodes[13].innerHTML;
		document.getElementById("edit-housingFund").value = oneRecord.childNodes[15].innerHTML;
		document.getElementById("edit-transportation").value = oneRecord.childNodes[17].innerHTML;
		document.getElementById("edit-meal").value = oneRecord.childNodes[19].innerHTML;
		document.getElementById("edit-general").value = oneRecord.childNodes[21].innerHTML;
	}

	function welfareConfDelete()
	{
		var selectedList = getSelected();
		if(selectedList == null)return;

		deleteStr = "";

		for (var i = selectedList.length - 1; i >= 0; i--) {
			console.log(selectedList[i].parentElement.id);
			deleteStr += selectedList[i].parentElement.id +",";
		}
		window.location.href="/hrms_demo/staffWelfare/delStaffWelfare"+"?deleteStr="+deleteStr		
	}

	function talentEdit()
	{
		var selectedList = document.getElementsByClassName('icheckbox_flat-green checked');
		if(selectedList.length == 0)return;//一个也没选中

		var oneRecord = selectedList[0].parentNode.parentNode
		console.log(oneRecord.childNodes[1].id);//选中的编号
		console.log(oneRecord);//父节点，可遍历每条记录
		for (var i = oneRecord.childNodes.length - 1; i >= 0; i--) {
			console.log(oneRecord.childNodes[i]);
		}

		//console.log	(oneRecord.childNodes);
		document.getElementById("editTalentPoolId").value = oneRecord.childNodes[1].id;
		document.getElementById("editTalentName").value = oneRecord.childNodes[3].innerHTML;
		//document.getElementById("sex").value = oneRecord.childNodes[5].innerHTML;
		document.getElementById("editEmail").value = oneRecord.childNodes[7].innerHTML;
		document.getElementById("editRecruitType").value = oneRecord.childNodes[9].innerHTML;
		document.getElementById("editRecruitPost").value = oneRecord.childNodes[11].innerHTML;
		document.getElementById("editComment").value = oneRecord.childNodes[13].innerHTML;
		document.getElementById("editResumeName").value = oneRecord.childNodes[15].innerHTML;
	}

	function talentDelete()
	{
		var selectedList = getSelected();
		if(selectedList == null)return;

		deleteStr = "";

		for (var i = selectedList.length - 1; i >= 0; i--) {
			console.log(selectedList[i].parentElement.id);
			deleteStr += selectedList[i].parentElement.id +",";
		}
		window.location.href="/hrms_demo/talentPool/delTalentPool"+"?deleteStr="+deleteStr		
	}

	function editStaff(record)
	{

		document.getElementById("demo-form2").action = "/hrms_demo/staff/updateStaff";

		var records = record.split(',');
		record = {};
		for (var i = records.length - 1; i >= 0; i--) {
			onevalue = records[i].split('=');
			record[onevalue[0].trim()] = onevalue[1].trim();
		}
		console.log(record);
		document.getElementById("edit-staffId").value = record.staffId;

		document.getElementById("edit-staffNo").value = record.staffNo;
		document.getElementById("edit-staffName").value = record.staffName;
		document.getElementById("edit-bank").value = record.bank;

		document.getElementById("single_cal4").value = record.birthDate;
		document.getElementById("edit-wechat").value = record.wechat;
		document.getElementById("edit-bankAccount").value = record.bankAccount;

		document.getElementById("edit-sex").value = record.sex;
		document.getElementById("edit-email").value = record.email;

		document.getElementById("edit-school").value = record.school;
		document.getElementById("edit-phoneNo").value = record.phoneNo;

		document.getElementById("edit-identity").value = record.identity;
		document.getElementById("edit-qq").value = record.qq;
		document.getElementById("edit-nationality").value = record.nationality;

		document.getElementById("edit-nativePlace").value = record.nativePlace;
		document.getElementById("edit-degree").value = record.degree;
		document.getElementById("edit-nation").value = record.nation;

		document.getElementById("selectDepartment").value = record.departmentNo;
		document.getElementById("selectPost").value = record.postNo;
		document.getElementById("edit-major").value = record.major;

		document.getElementById("edit-address").value = record.address;
		document.getElementById("edit-photo").value = record.photo;

	}

	function delStaff(staffid)
	{
		window.location.href="/hrms_demo/staff/delStaff"+"?deleteStr="+staffid				
	}

	function transferDelete()
	{
		var selectedList = getSelected();
		if(selectedList == null)return;

		deleteStr = "";

		for (var i = selectedList.length - 1; i >= 0; i--) {
			console.log(selectedList[i].parentElement.id);
			deleteStr += selectedList[i].parentElement.id +",";
		}
		window.location.href="/hrms_demo/staffTransfer/delTransfer"+"?deleteStr="+deleteStr

	}

	function salaryEdit()
	{
		var selectedList = document.getElementsByClassName('icheckbox_flat-green checked');
		if(selectedList.length == 0)return;//一个也没选中

		var oneRecord = selectedList[0].parentNode.parentNode
		console.log(oneRecord.childNodes[1].id);//选中的编号
		console.log(oneRecord);//父节点，可遍历每条记录
		for (var i = oneRecord.childNodes.length - 1; i >= 0; i--) {
			console.log(oneRecord.childNodes[i]);
		}

		//console.log	(oneRecord.childNodes);
		document.getElementById("editSalaryId").value = oneRecord.childNodes[1].id;
		document.getElementById("editStaffNo").value = oneRecord.childNodes[3].innerHTML;
		document.getElementById("editYear").value = oneRecord.childNodes[5].innerHTML;
		document.getElementById("editMonth").value = oneRecord.childNodes[7].innerHTML;
		document.getElementById("editSalary").value = oneRecord.childNodes[9].innerHTML;
		document.getElementById("editPublisher").value = oneRecord.childNodes[11].innerHTML;
		document.getElementById("editPublishDate").value = oneRecord.childNodes[13].innerHTML;		
	}

	function salaryDelete()
	{
		var selectedList = getSelected();
		if(selectedList == null)return;

		deleteStr = "";

		for (var i = selectedList.length - 1; i >= 0; i--) {
			console.log(selectedList[i].parentElement.id);
			deleteStr += selectedList[i].parentElement.id +",";
		}
		window.location.href="/hrms_demo/salary/delSalary"+"?deleteStr="+deleteStr

	}

	function welfareEdit()
	{
		var selectedList = document.getElementsByClassName('icheckbox_flat-green checked');
		if(selectedList.length == 0)return;//一个也没选中

		var oneRecord = selectedList[0].parentNode.parentNode
		console.log(oneRecord.childNodes[1].id);//选中的编号
		console.log(oneRecord);//父节点，可遍历每条记录
		for (var i = oneRecord.childNodes.length - 1; i >= 0; i--) {
			console.log(oneRecord.childNodes[i]);
		}

		//console.log	(oneRecord.childNodes);
		document.getElementById("edit-welfareId").value = oneRecord.childNodes[1].id;
		document.getElementById("edit-name").value = oneRecord.childNodes[3].innerHTML;
		document.getElementById("edit-amount").value = oneRecord.childNodes[5].innerHTML;
		document.getElementById("edit-percentage").value = oneRecord.childNodes[7].innerHTML;
	
	}

	function welfareDelete()
	{
		var selectedList = getSelected();
		if(selectedList == null)return;

		deleteStr = "";

		for (var i = selectedList.length - 1; i >= 0; i--) {
			console.log(selectedList[i].parentElement.id);
			deleteStr += selectedList[i].parentElement.id +",";
		}
		window.location.href="/hrms_demo/welfare/delWelfare"+"?deleteStr="+deleteStr

	}

//}
//);