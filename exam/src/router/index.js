import Vue from 'vue'
import Router from 'vue-router'
import login from '@/components/common/login'
import demo from '@/vuex/Demo'
import header from '@/components/common/header'
import mainLeft from '@/components/common/mainLeft'
import index from '@/components/admin/index'
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'login',
      component: login
    },
    {path: '/test',component: demo},
    {path: '/header',component:header,children:[{path:'/',component:mainLeft}]},
    {path: '/index',component:index}
  ]
})
