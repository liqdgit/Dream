/**
 * Created by liqd on 2017/10/20.
 */

$('#excel-file').change(function (e) {
    var files = e.target.files;

    var fileReader = new FileReader();
    fileReader.onload = function (ev) {
        var persons = [];
        var workbook;
        try {
            var data = ev.target.result;
            workbook = XLS.read(data,{type: 'binary'}); // 以二进制流方式读取得到整份excel表格对象
        } catch (e) {
            console.log('文件类型不正确');
            return;
        }

        // 表格的表格范围，可用于判断表头是否数量是否正确
        var fromTo = '';
        // 遍历每张表读取
        for (var sheet in workbook.Sheets) {
            if (workbook.Sheets.hasOwnProperty(sheet)) {
                fromTo = workbook.Sheets[sheet]['!ref'];
                console.log(fromTo);
                persons = persons.concat(XLSX.utils.sheet_to_json(workbook.Sheets[sheet]));
                // break; // 如果只取第一张表，就取消注释这行
            }
        }
        console.log(persons);
    };
    // 以二进制方式打开文件
    fileReader.readAsBinaryString(files[0]);
});
