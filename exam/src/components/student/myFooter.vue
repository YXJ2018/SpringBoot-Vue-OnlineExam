<!--页脚部分-->
<template>
  <footer id="footer">
    <ul>
      <li><a href="javascript:;">关于我们</a></li>
      <li><a href="javascript:;">免责声明</a></li>
      <li><a href="javascript:;">使用协议</a></li>
      <li>渝ICP备案号19001371号</li>
      <li>@Copyright 2018-2019. ALL Rights Reserved</li>
    </ul>
  </footer>
</template>

<script>
export default {
  name: "myFooter"
}
</script>

<style scoped>
#footer a {
  color: #919698;
  font-size: 14px;
}
#footer {
  background-color: #eee;
}
#footer ul {
  margin-top: 40px;
  border-top: 1px solid #d5d5d5;
  display: flex;
  justify-content: center;
  height: 80px;
  line-height: 80px;
}
#footer ul li {
  color: #919698;
  font-size: 14px;
  margin-right: 20px;
}
</style>
