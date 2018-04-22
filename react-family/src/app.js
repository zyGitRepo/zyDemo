import React from 'react';
import ReactDom from 'react-dom';
//import Hello from 'component/Hello/Hello';
import {AppContainer} from 'react-hot-loader';
import {Provider} from 'react-redux';
import store from './redux/store';
import getRouter from 'router/router';

/*ReactDom.render(
	<div>Hello React!</div>,document.getElementById('app')
);*/

/*
 * 引用Hello组件
 */
/*ReactDom.render(
	<Hello/>,document.getElementById('app')
);
*/

/*初始化*/
renderWithHotReload(getRouter());

/*热更新*/
if(module.hot){
	module.hot.accept('./router/router',()=>{
		const getRouter = require('./router/router').default;
        renderWithHotReload(getRouter());
	});
}

function renderWithHotReload(RootElement) {
    ReactDom.render(
        <AppContainer>
			<Provider store={store}>
				{RootElement}
			</Provider>
        </AppContainer>,
        document.getElementById('app')
    )
}

/*
 * 引用Router，引入<Provider>时，注掉下边的代码
 */
/*ReactDom.render(
	getRouter(),document.getElementById('app')
);*/