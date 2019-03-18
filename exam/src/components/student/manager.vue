<!--管理中心-->
<template>
  <div id='manager'>
    <el-form :model="ruleForm2" status-icon :rules="rules2" ref="ruleForm2" label-width="100px" class="demo-ruleForm">
      <h3 class="alter">修改你的密码</h3>
        <el-form-item label="密码" prop="pass" class="pass">
        <el-input type="password" v-model="ruleForm2.pass" autocomplete="off"></el-input>
      </el-form-item>
      <el-form-item label="确认密码" prop="checkPass">
        <el-input type="password" v-model="ruleForm2.checkPass" autocomplete="off"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="submitForm('ruleForm2')">提交</el-button>
        <el-button @click="resetForm('ruleForm2')">重置</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
  export default {
    data() {
      var validatePass = (rule, value, callback) => {
        if (value === '') {
          callback(new Error('请输入密码'));
        } else {
          if (this.ruleForm2.checkPass !== '') {
            this.$refs.ruleForm2.validateField('checkPass');
          }
          callback();
        }
      };
      var validatePass2 = (rule, value, callback) => {
        if (value === '') {
          callback(new Error('请再次输入密码'));
        } else if (value !== this.ruleForm2.pass) {
          callback(new Error('两次输入密码不一致!'));
        } else {
          callback();
        }
      };
      return {
        ispass: true,
        ruleForm2: {
          pass: '',
          checkPass: ''
        },
        rules2: {
          pass: [
            { validator: validatePass, trigger: 'blur' }
          ],
          checkPass: [
            { validator: validatePass2, trigger: 'blur' }
          ]
        }
      };
    },
    methods: {
      submitForm(formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
            let studentId = this.$cookies.get("cid")
            this.$axios({ //修改密码
              url: '/api/studentPWD',
              method: 'put',
              data: {
                pwd: this.ruleForm2.pass,
                studentId
              }
            }).then(res => {
              if(res.data != null ) { //修改成功提示
                this.$message({
                  message: '密码修改成功...',
                  type: 'success'
                })
              }
            })
          } else {
            console.log('error submit!!');
            return false;
          }
        });
      },
      resetForm(formName) {
        this.$refs[formName].resetFields();
      }
    }
  }
</script>

<style scoped>
#manager .pass  label{
  color: red;
  font-size: 20px;
}
#manager {
  width: 600px;
  margin: 0 auto;
  margin-top: 100px;
  text-align: center;
  margin-bottom: 300px;
}
#manager .alter {
  margin: 30px 0px;
}
</style>