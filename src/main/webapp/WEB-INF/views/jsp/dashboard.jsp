<%@ page %><%--
  Created by IntelliJ IDEA.
  User: miral
  Date: 7/16/2017
  Time: 1:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.form/4.2.1/jquery.form.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/dashboard.css">


</head>
<body>

<jsp:include page="userheader.jsp"></jsp:include>
<jsp:include page="topicmodal.jsp"></jsp:include>
<jsp:include page="linkResourceModal.jsp"></jsp:include>
<jsp:include page="docresourcemodal.jsp"></jsp:include>
<jsp:include page="invitationmodal.jsp"></jsp:include>
<script>
    $(document).ready(function () {
        var subs=new Object();
        $.ajax({
            url: "/dashboard/getTopicList",

            type: 'GET',
            success: function (List) {
                console.log(List);
                $(idName).empty();
                for (i = 0; i < List.length; i++) {
                    var subs = List[i];
                    var row = $('<option value=' + subs.topic.topicId + '>' + subs.topic.name + '</option>');
                    $(idName).append(row);
                }

            },

            error: function () {
                console.log("no values")
            }
        });


    });

    getTopics('#Topic'),
        getTopics('#Topics'),
        $('#addTopic').on('click', function () {

            $.ajax({
                url: "/dashboard/createTopic",
                data: {
                    userId: ${User.userId},
                    name:$('#Name').val(),
                    visible:$('#visible').val()

                },
                type: 'POST',
                success: function (data) {
                    $('#myModal').modal('hide');
                    console.log(data);
                },

                error: function () {
                    $('#myModal').modal('hide');
                }
            });

        });

    $('#Name').blur(function () {

        $.ajax({
            url: "/topic/checkName",
            type:'POST',
            data: {name: $('#Name').val(),
                id:${User.userId}},

            success: function (data) {
                if(data==true)
                    alert("topic name already taken")


            },
            error: function () {

            }
        });



    });

    $('#addLink').on('click', function () {

        $.ajax({
            url: "/resource/createlinkresource",
            type: 'POST',
            data: {
                url:$('#Link').val(),
                description:$('#Description').val(),
                topicId:$('#Topic').val(),
                userId: ${User.userId},


            },

            success: function (data) {
                console.log(data);
                $('#myLinkModal').modal('hide');

            },

            error: function () {
                $('#myLinkModal').modal('hide');
            }
        });
    });

    $("#docForm").ajaxForm({

        success: function (data) {
            console.log(data);
            $('#myDocModal').modal('hide');

        },

        error: function (data) {
            $('#myDocModal').modal('hide');
        }
    });



    $('#linkModal').on('click',getTopics('#Topic'));
    $('#docModal').on('click',getTopics('#Topics'));
    function  getTopics(idName) {


        var subs=new Object();
        $.ajax({
            url: "/dashboard/getTopicList",

            type: 'GET',
            success: function (List) {
                console.log(List);
                $(idName).empty();
                for (i = 0; i < List.length; i++) {
                    var subs = List[i];
                    var row = $('<option value=' + subs.topic.topicId + '>' + subs.topic.name + '</option>');
                    $(idName).append(row);
                }

            },

            error: function () {
                console.log("no values")
            }
        });

    }


</script>
</body>
</html>
