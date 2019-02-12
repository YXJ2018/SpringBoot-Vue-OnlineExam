<!--考生答题界面-->
<template>
  <div id="answer">
     <div class="top">
       <ul class="item">
         <li><i class="iconfont icon-menufold icon20"></i></li>
         <li>测试-公务员考试行测</li>
         <li @click="flag = !flag">
           <i class="iconfont icon-user icon20"></i>
           <div class="msg" v-if="flag">
             <p>姓名：小鱼</p>
             <p>准考证号:201558274084</p>
           </div>
         </li>
         <li><i class="iconfont icon-arrLeft icon20"></i></li>
       </ul>
     </div>
  </div>
</template>
<style scoped>
#answer .top {
  background-color: #6bb851;
}
#answer .item {
  color: #fff;
  display: flex;
  padding: 20px;
  font-size: 20px;
}
#answer .item li:nth-child(1) {
  margin-right: 10px;
}
#answer .item li:nth-child(3) {
  position: relative;
  margin-left: auto;
}
.icon20 {
  font-size: 20px;
  font-weight: bold;
}
.item .msg {
  padding: 10px 15px;
  border-radius: 4px;
  top: 47px;
  right: -30px;
  color: #6c757d;
  position: absolute;
  border: 1px solid rgba(0,0,0,.15);
}
.item .msg p {
  font-size: 16px;
  width: 200px;
  text-align: left;
}
</style>
<script>
export default {
  data() {
    return {
      flag: false
    }
  },
  methods: {
    
  },
}
</script>
