import Vue from 'vue'
import Router from 'vue-router'
import axios from 'axios'
import HelloWorld from '@/components/HelloWorld'
import SayHi from '@/components/SayHi'
import Login from '@/components/Login'

Vue.use(Router)
Vue.prototype.$axios= axios
// 改成/api才能用proxyTable跨域
axios.defaults.baseURL = '/api'
export default new Router({
  mode:'history',
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
      path:'/SayHi',
      name:'SayHi',
      component:SayHi
    },
    {
      path:'/login',
      name:'Login',
      component:Login
    }

  ]
})
