<!--学生考试首页-->
<template>
  <div id="student">
    <el-row class="padding-50">
      <el-col :span="24">
        <ul class="list">
          <li class="logo"><i class="iconfont icon-kaoshi"></i><span>Exam-Online</span></li>
          <li><a href="javascript:;">控制台</a></li>
          <li><router-link to="student">试卷</router-link></li>
          <li><router-link to="startExam">考试</router-link></li>
          <li><a href="javascript:;">报名</a></li>
          <li><a href="javascript:;">题库</a></li>
          <li><a href="javascript:;">组卷</a></li>
          <li class="right" @click="flag = !flag">
            <a href="javascript:;"><i class="iconfont icon-Userselect icon"></i></a>
            <div class="msg" v-if="flag" @click="manage">
              <p>管理中心</p>
              <p class="exit">退出</p>
            </div>
          </li>
        </ul>
      </el-col>
    </el-row>
    <!--路由区域-->
    <div class="main">
      <router-view></router-view>
    </div>
    <v-footer></v-footer>
  </div>
</template>

<script>
import myFooter from "@/components/student/myFooter"
import store from '@/vuex/store'
import {mapState} from 'vuex'
export default {
  store,
  components: {
    "v-footer": myFooter
  },
  data() {
    return {
      flag: false
    }
  },
  methods: {
    //退出区域
    toggle() {
      console.log("退出区域")
      // this.flag = !this.flag
    },
    manage() {
      this.$router.push({path: '/manager'})
    }
  },
  computed:mapState(["userInfo"])
}
</script>

<style scoped>
.right .icon {
  margin-right: 6px;
}
#student .padding-50 {
  margin: 0 auto;
  padding: 0 50px;
  box-shadow: 0 0 10px 4px rgba(1,149,255,0.1);
  background-color: #fff;
}
.list a {
  text-decoration: none;
  color: #334046;
}
li {
  list-style: none;
  height: 60px;
  line-height: 60px;
}
#student .list{
  display: flex;
}
#student .list li {
  padding: 0 20px;
  cursor: pointer;
}
#student .list li:hover {
  background-color: #0195ff;
  transition: all 2s ease;
}
#student .list li:hover a {
  color: #fff;
}
#student .list .right {
  margin-left: auto;
  position: relative;
}
#student .list li.right :hover a {
  color: #000;
}
#student .list .logo {
  display: flex;
  font-weight: bold;
  color: #2f6c9f;
}
#student .list .logo i {
  font-size: 50px;
}
.right .msg {
  text-align: center;
  position: absolute;
  top: 60px;
  left: 0px;
  display: flex;
  flex-direction: column;
  border-radius: 2px;
  border-bottom: 3px solid #0195ff;
  background-color: #fff;
}
.right .msg p {
  height: 40px;
  line-height: 40px;
  width: 105px;
}
.right .msg p:hover {
  background-color: #0195ff;
}
</style>
