<template>
  <div name="Login">
    <h3>用户登录</h3>
        
    <input v-model="loginForm.userName" placeholder="userName" />

    <input v-model="loginForm.password" placeholder="password" />
    <button @click="login">登录</button>
      <h1>{{ message }}</h1>

  </div>
</template>



<script>
export default {
  name: 'Login',
  data() {
    return {
        message: 'Hello Vue!',
      loginForm: {
        userName: "",
        password: "",
      },
    };
  },

  methods: {
    login () {
      let _this = this;
      if (this.loginForm.userName === '' || this.loginForm.password === '') {
        this.message='不能为空'
      } else {
        this.$axios({
          method: 'post',
        //   url: 'http://localhost:8080/menu/login',
          url: '/menu/login',
          data: _this.loginForm
        }).then(res => {
          console.log(res.data);
          this.message='登陆成功';
        }).catch(error => {
          this.message='账号或密码错误';
          console.log(error);
        });
      }
    }
  },
};
</script>