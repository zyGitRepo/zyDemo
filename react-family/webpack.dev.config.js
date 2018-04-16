const path = require('path');
var HtmlWebpackPlugin = require('html-webpack-plugin');

module.exports = {
	/* 开发工具，便于查错及代码调试 */
	devtool: 'inline-source-map',
 
    /*入口*/
    entry: [
		'react-hot-loader/patch',
		path.join(__dirname, 'src/app.js')
    ],

    /*输出到dist文件夹，输出文件名字为bundle.js*/
    output: {
        path: path.join(__dirname, './dist'),
        filename: '[name].[hash].js',
        chunkFilename: '[name].[chunkhash].js'	//实现按需加载时，按对应的模块名生成对应的bundle.js文件
    },

	/*src文件夹下面的以.js结尾的文件，要使用babel解析*/
	/*cacheDirectory是用来缓存编译结果，下次编译加速*/
	module: {
		rules: 
		[	
			{
				test: /\.js$/,
				use: ['babel-loader?cacheDirectory=true'],
				include: path.join(__dirname, 'src')
			},
			{
				test: /\.css$/,
				use: ['style-loader', 'css-loader']
			}
		]
	},
	
	/*给路径取别名*/
	resolve: {
        alias: {
            pages: path.join(__dirname, 'src/pages'),
            component: path.join(__dirname, 'src/component'),
            router: path.join(__dirname, 'src/router'),
			actions: path.join(__dirname, 'src/redux/actions'),
            reducers: path.join(__dirname, 'src/redux/reducers'),
        }
    },

	/* 配置webpack-dev-server */
	devServer:{
		port:8080,
		contentBase:path.join(__dirname,'./dist'),
		historyApiFallback:true,
		host:'0.0.0.0'
	},
	plugins: [new HtmlWebpackPlugin({
        filename: 'index.html',
        template: path.join(__dirname, 'src/index.html')
    })]
};