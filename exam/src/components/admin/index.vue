// 展示组件页面
<template>
  <div id="index">
    <header1 class="topbar"></header1>
    <el-row>
      <el-col :span="4" class="left_side">
        <mainLeft></mainLeft>
      </el-col>
      <el-col :span="20" class="main_wrapper">
        <navigator class="nav"></navigator>
        <router-view></router-view>
      </el-col>
    </el-row>
  </div>
</template>

<script>
import header from '@/components/common/header'
import mainLeft from '@/components/common/mainLeft'
import navigator from '@/components/common/navigator'
export default {
  components:{
    header1: header,
    mainLeft: mainLeft,
    navigator:navigator
  },
  methods: {
    
  }
}
</script>

<style scoped>
#index .nav {
  box-shadow: 1px 0 5px rgba(0, 0, 0, 0.1);
  margin-bottom: 30px;
}
</style>

