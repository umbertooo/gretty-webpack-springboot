module.exports = {
  outputDir: 'target/classes/META-INF/resources/gui',
  // ./src/base-url.js ergänzt zur Laufzeit einen ggfs. erforderlichen Servlet Context
  baseUrl: 'gui/',
  assetsDir: 'static',
  lintOnSave: false,
  devServer: {
    open: false,
    port: 5555,
    proxy: {
      '/api': {
        target: 'http://localhost:8080/',
        ignorePath: false,
        changeOrigin: true
      }
    }
  }
}
