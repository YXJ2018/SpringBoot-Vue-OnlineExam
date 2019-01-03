<!--左边下拉导航栏-->
<template>
  <div id="left">
    <el-menu default-active="$route.path" class="el-menu-vertical-demo" @open="handleOpen" @close="handleClose" :collapse="flag" ref="item">
      <el-submenu index="1">
        <template slot="title">
          <i class="iconfont icon-kechengbiao"></i>
          <span slot="title" class="title">课程管理</span>
        </template>
        <el-menu-item-group>
          <span slot="title">管理你的课程</span>
          <el-menu-item index="1-1">增加课程</el-menu-item>
          <el-menu-item index="1-2">修改课程</el-menu-item>
          <el-menu-item index="1-3">查看课程</el-menu-item>
        </el-menu-item-group>
      </el-submenu>
      <el-submenu index="2">
        <template slot="title">
          <i class="iconfont icon-tiku"></i>
          <span slot="title" class="title">题库管理</span>
        </template>
        <el-menu-item-group>
          <span slot="title">管理你的题库</span>
          <el-menu-item index="2-1">增加题库</el-menu-item>
          <el-menu-item index="2-2">修改题库</el-menu-item>
          <el-menu-item index="2-3">查看题库</el-menu-item>
        </el-menu-item-group>
      </el-submenu>
      <el-submenu index="3">
        <template slot="title">
          <i class="iconfont icon-performance"></i>
          <span slot="title" class="title">成绩查询</span>
        </template>
        <el-menu-item-group>
          <span slot="title">查询学生成绩</span>
          <el-menu-item index="3-1">根据班级查看成绩</el-menu-item>
          <el-menu-item index="3-2" @click="routerToGrade()">成绩统计</el-menu-item>
        </el-menu-item-group>
      </el-submenu>
      <el-submenu index="4">
        <template slot="title">
          <i class="iconfont icon-pingfen"></i>
          <span slot="title" class="title">评分阅卷</span>
        </template>
        <el-menu-item-group>
          <el-menu-item index="4-1">开始阅卷</el-menu-item>
          <el-menu-item index="4-2">阅卷管理</el-menu-item>
        </el-menu-item-group>
      </el-submenu>
      <el-submenu index="5">
        <template slot="title">
          <i class="iconfont icon-role"></i>
          <span slot="title" class="title">角色管理</span>
        </template>
        <el-menu-item-group>
          <el-menu-item index="5-1">权限设置</el-menu-item>
        </el-menu-item-group>
      </el-submenu>
      <el-submenu index="6">
        <template slot="title">
          <i class="iconfont icon-LC_icon_user_group_add"></i>
          <span slot="title" class="title">用户管理</span>
        </template>
        <el-menu-item-group>
          <el-menu-item index="6-1">用户操作</el-menu-item>
        </el-menu-item-group>
      </el-submenu>
      <el-submenu index="7">
        <template slot="title">
          <i class="iconfont icon-module4mokuai"></i>
          <span slot="title" class="title">模块管理</span>
        </template>
        <el-menu-item-group>
          <el-menu-item index="7-1">模块操作</el-menu-item>
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
      // isCollapse: false
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