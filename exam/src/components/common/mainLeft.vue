<!--左边下拉导航栏-->
<template>
  <div id="left">
    <el-menu default-active="$route.path" class="el-menu-vertical-demo" @open="handleOpen" @close="handleClose" :collapse="flag">
      <el-submenu v-for="(item,index) in menu" :index='item.index' :key="index">
        <template slot="title">
          <div @click="handleTitle(item.index)">
            <i class="iconfont icon-kechengbiao"></i>
            <span slot="title" class="title">{{item.title}}</span>
          </div>
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

    }
  },
  computed: mapState(["flag","menu"]),
  methods: {
    handleOpen(key, keyPath) {
      console.log(key, keyPath);
    },
    handleClose(key, keyPath) {
      console.log(key, keyPath);
    },
    //点击标题传递参数给navigator组件
    handleTitle(index) {
      this.bus.$emit('sendIndex',index)
    }
  },
  store
}
</script>