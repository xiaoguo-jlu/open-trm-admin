const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  publicPath: '/',
  devServer: {
    proxy: {
      '/open-trm/services': {
        target: "http://127.0.0.1:8003",
        changeOrigin: true,
      }
    }
  }
})
