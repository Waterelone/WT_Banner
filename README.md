###step1
**在项目根目录build.grade文件中添加**
<pre><code>
allprojects {
 		repositories {
 			...
 			maven { url 'https://jitpack.io' }
 		}
}
</code></pre>


 ###step2
 **在app项目下的build.grade文件中添加依赖**
 <pre><code>
 dependencies {
         compile 'com.github.Waterelone:WT_Banner:8c546fa93b'
 }
 </code></pre>