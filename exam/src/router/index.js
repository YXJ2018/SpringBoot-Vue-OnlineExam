import Vue from 'vue'
import Router from 'vue-router'
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'login',
      component: () => import('@/components/common/login')
    },
    {
      path: '/index',
      component: () => import('@/components/admin/index'),
      children: [
        {
          path:'/grade',
          component: () => import('@/components/common/grade')
        }
      ]
    },
    {
      path: '/student',
      component: ()=> import('@/components/student/index'),
      children: [
        {path:"/",component: ()=> import('@/components/student/myExam')},
        {path:'/startExam', component: ()=> import('@/components/student/startExam')},
        {path: '/manager', component: ()=> import('@/components/student/manager')},
        {path: '/examMsg', component: ()=> import('@/components/student/examMsg')},
        {path: '/message', component: ()=> import('@/components/student/message')}
      ]
    },
    {path: '/answer',component: ()=> import('@/components/student/answer')}
  ]
})
