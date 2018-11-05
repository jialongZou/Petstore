window.onload = function () {
    document.getElementById("btn_1").onclick = function () {
        var div1 = document.getElementById("div1");
        var div2 = document.getElementById("div2");
        var btn = document.getElementById("btn_1");
        var h = document.getElementsByTagName("h1")[0];

        if (div1.style.display != 'none') {
            div2.style.display = "block";
            div1.style.display = "none";
            btn.value = '查看宠物列表';
            h.innerHTML = '所有未上架宠物';
        } else {
            div2.style.display = "none";
            div1.style.display = "block";
            btn.value = '查看未上架宠物';
            h.innerHTML = '宠物列表';
        }
    }
}

