<!--左边下拉导航栏-->
<template>
  <div id="left">
    <el-menu
      active-text-color="#dd5862" 
      text-color="#ffffff5e" 
      :default-active="this.$route.path"
      class="el-menu-vertical-demo" 
      @open="handleOpen" 
      @close="handleClose" 
      :collapse="flag"
      background-color="#545c64"  
      menu-trigger="click" router>
      <el-submenu v-for="(item,index) in menu" :index='item.index' :key="index">
        <template slot="title">
          <div @click="handleTitle(item.index)" class="left-width">
            <i class="iconfont" :class="item.icon"></i>
            <span slot="title" class="title">{{item.title}}</span>
          </div>
        </template>
        <el-menu-item-group v-for="(list,index1) in item.content" :key="index1">
          <el-menu-item :index="list.path" v-if="list.item1 != null">{{list.item1}}</el-menu-item>
          <el-menu-item :index="list.path" v-if="list.item2 != null">{{list.item2}}</el-menu-item>
          <el-menu-item :index="list.path" v-if="list.item3 != null">{{list.item3}}</el-menu-item>
        </el-menu-item-group>
      </el-submenu>
    </el-menu>
  </div>
</template>

<style>
.el-menu-vertical-demo .el-submenu__title {
  overflow: hidden;
}
.left-width .iconfont {
  font-size: 18px;
  color: teal;
}
.left-width {
  width: 213px;
}
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
  margin-left: 14px;
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
      
    }
  },
  computed: mapState(["flag","menu"]),
  methods: {
    handleOpen(key, keyPath) {
      // console.log(key, keyPath);
    },
    handleClose(key, keyPath) {
      // console.log(key, keyPath);
    },
    //点击标题传递参数给navigator组件
    handleTitle(index) {
      this.bus.$emit('sendIndex',index)
    }
  },
  store
}
</script>