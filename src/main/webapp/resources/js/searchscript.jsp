<%--
  Created by IntelliJ IDEA.
  User: miral
  Date: 7/21/2017
  Time: 2:54 PM
  To change this template use File | Settings | File Templates.
--%>

    $('#search').autocomplete({
        source: function (request, response) {
            $.ajax({
                url: "/dashboard/getPublicTopics",
                type: "post",
                accept: "application/json",

                data: {
                    name: $("#search").val()
                },
                success: function (data) {
                    response($.map(data, function (item) {
                        return {
                            label: item,
                            value: item,

                        }
                    }));
                }
            });
        },

        autoFocus: true,
        minLength: 1
    });

