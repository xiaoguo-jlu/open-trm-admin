<template>
  <div id="app">
    <el-container class="common-layout">
      <el-header id="header">
        <el-row>
          <el-col :span="24" id="logo"><p></p></el-col>
        </el-row>
        <el-row>
          <el-col :span="3" id="logo">Open TRM</el-col>
          <el-col :span="2" class="menu">
            <router-link to="/home">Home</router-link>
          </el-col>
          <el-col :span="2" class="menu">
            Cash Management
          </el-col>
          <el-col :span="2" class="menu">
            Deal
          </el-col>
          <el-col :span="2" class="menu">
            Settlement
          </el-col>
          <el-col :span="2" class="menu">
            Report
          </el-col>
          <el-col :span="2" class="menu">
            Instrument
          </el-col>
          <el-col :span="2" class="menu">
            Rule
          </el-col>
          <el-col :span="2" class="menu">
            <router-link to="/static-data/currency">Data</router-link>
          </el-col>
          <el-col :span="2" class="menu">
            Config
          </el-col>
          <el-col :span="3" class="User">
            User
          </el-col>
        </el-row>
      </el-header>
      <el-main id="main">
        <router-view/>
      </el-main>
      <el-footer id="footer">Footer</el-footer>
    </el-container>
  </div>
</template>


<script>
export default {
  name: 'SpecialMenu',
  props: {
    msg: String
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
