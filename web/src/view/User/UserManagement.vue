<template>
    <div id="app">
        <h1>User Management</h1>
        <h1>{{ response.data }}</h1>
        <el-button @click="search()">search</el-button>
    </div>
</template>

<script>
    export default {
        name: "UserManagementView",
        data() {
          return {
              response: {
                  data: "no data",
              }
          }
        },
        methods: {
            search() {
                // axios.get('ht')
                console.log("");
            },
        },
    }
</script>

<style scoped>

</style>