function editOne(reaordId) {
	finems.progress();
	var data = {};
	var idKey = 'id';
	data[idKey] = (reaordId);
	finems.getById('getId.do', data, function(result) {
		finems.closeProgress();
		$("#baseid").combobox({
			url: '../sysBase/loadbaseList.do',
			valueField: 'id',
			textField: 'baseName',
			multiple: false
		});
		$("#greehouseid").combobox({
			url: '../sysGreenhouse/loadGreenhouseList.do',
			valueField: 'id',
			textField: 'name',
			multiple: false,
			onHidePanel: function(){
				$("#plantid").combobox("setValue", '');
				var greehouseid = $('#greehouseid').combobox('getValue');		
				$.ajax({
					type: "POST",
					url: "../sysPlant/loadPlantList.do?greenhouseid="+greehouseid,
					cache: false,
					dataType : "json",
					success: function(data) {
						$("#plantid").combobox("loadData", data);
					}
				}); 	
			}
		});
		$("#plantid").combobox({
			url: '../sysPlant/loadPlantList.do?greenhouseid=' + result.data.greehouseid,
			valueField: 'id',
			textField: 'variety',
			multiple: false
		});
		$("#editForm").form('load', result.data);
		$("#baseid").combobox('select', result.data.baseid);
		$("#greehouseid").combobox('select', result.data.greehouseid);
		$("#plantid").combobox('select', result.data.plantid);
		$("#filecontrol").hide();
		$("#edit-win").dialog({title: "编辑"});
		$("#edit-win").dialog('open'); 
	});
}

function queryOne(reaordId) {
	finems.progress();
	var data = {};
	var idKey = 'id';
	data[idKey] = (reaordId);
	finems.getById('getId.do', data, function(result) {
		finems.closeProgress();
		$("#base_q").text(result.data.baseName);
		$("#greehouse_q").text(result.data.greenhousename);
		$("#plant_q").text(result.data.variety);
		$("#numberharvest_q").text(result.data.numberharvest);
		$("#grade_q").text(result.data.grade);
		$("#unitprice_q").text(result.data.unitprice);
		$("#harveststaff_q").text(result.data.harveststaff);
		$("#inspectionstaff_q").text(result.data.inspectionstaff);
		$("#remark_q").text(result.data.remark);
		var list = result.data.list;
		var html = "<table>";
		for (var i = 0; i < list.length; i++) {
			html = html + "<tr><td><a href='" + urls['msPath'] + urls['msUrl'] + list[i].url + "' download>" + list[i].fileName + "</a></td></tr>"
		}
		html = html + "</table>";
		$("#fileMsg").html(html);
		$("#query-win").dialog('open'); 
	});
}