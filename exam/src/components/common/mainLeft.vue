<!--左边下拉导航栏-->
<template>
  <div id="left">
    <el-menu default-active="$route.path" class="el-menu-vertical-demo"  @close="handleClose" :collapse="flag" ref="item">
      <el-submenu v-for="(item,index) in menu" :index='item.index' :key="index">
        <template slot="title">
          <i class="iconfont icon-kechengbiao"></i>
          <span slot="title" class="title">{{item.title}}</span>
        </template>
        <el-menu-item-group>
          <el-menu-item :index="item.index+ '-' + item.index" v-show="item.item1 != null">{{item.item1}}</el-menu-item>
          <el-menu-item :index="item.index+ '-' + item.index+1" v-show="item.item2 != null">{{item.item2}}</el-menu-item>
          <el-menu-item :index="item.index+ '-' + item.index+2" v-show="item.item3 != null">{{item.item3}}</el-menu-item>
        </el-menu-item-group>
      </el-submenu>
    </el-menu>
  </div>
</template>

<style>
.el-menu-vertical-demo:not(.el-menu--collapse) {
  min-height: 600px;
}
#left {
  z-index: 0;
}
#left .el-menu-vertical-demo .title {
  color: #34a6c0;
  font-size: 16px;
  font-weight: bold;
}
.el-submenu__title:hover {
  background-color: #1f5082;
}
</style>

<script>
import store from '@/vuex/store'
import {mapState} from 'vuex'
export default {
  name: "mainLeft",
  data() {
    return {
      menu:[
        {index:'1',title:'课程管理',item1:'修改课程',item2:"增加课程",item3:'删除课程'},
        {index:'2',title:'题库管理',item1:'修改题库',item2:"增加题库",item3:'删除题库'},
        {index:'3',title:'成绩查询',item1:'根据班级查询成绩',item2:"成绩统计"},
        {index:'4',title:'评分阅卷',item1:'开始阅卷',item2:"阅卷管理"},
        {index:'5',title:'角色管理',item1:'权限设置'},
        {index:'6',title:'用户管理',item1:'用户操作'},
        {index:'7',title:'模块管理',item1:'模块操作'}
      ]
    }
  },
  computed: mapState(["flag"]),
  methods: {
    handleOpen(key, keyPath) {
      console.log(key, keyPath);
    },
    handleClose(key, keyPath) {
      console.log(key, keyPath);
    },
    routerToGrade() {
      this.$router.push({path: 'grade'})
    }
  },
  store
}
</script>