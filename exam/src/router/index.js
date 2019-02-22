import Vue from 'vue'
import Router from 'vue-router'
import login from '@/components/common/login'
import index from '@/components/admin/index'
import grade from '@/components/common/grade'
import student from '@/components/student/index'
import myExam from '@/components/student/myExam'
import startExam from '@/components/student/startExam'
import manager from '@/components/student/manager'
import examMsg from '@/components/student/examMsg'
import answer from '@/components/student/answer'
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'login',
      component: login
    },
    {path: '/index',component:index,children:[{path:'/grade',component:grade}]},
    {path: '/student',component:student,children:[
      {path:"/",component:myExam},
      {path:'/startExam',component:startExam},
      {path: '/manager',component: manager},
      {path: '/examMsg',component: examMsg}
    ]},
    {path: '/answer',component: answer}
  ]
})
