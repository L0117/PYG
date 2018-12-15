app.service('uploadService',function ($http) {
    //文件上传
    this.uploadFile=function () {
        var formdata=new FormData();
        //文件上传框的name
        formdata.append('file',file.files[0]);

        return $http({
            url:'../upload.do',
            method:'post',
            data:formdata,
            headers:{'Content-Type':undefined},
            transformRequest: angular.identity
        });
    }
});