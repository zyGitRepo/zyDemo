import React from 'react';
import ReactDom from 'react-dom';
import Hello from 'component/Hello/Hello';

/*ReactDom.render(
	<div>Hello React!</div>,document.getElementById('app')
);*/

/*
 * 引用Hello组件
 */
ReactDom.render(
	<Hello/>,document.getElementById('app')
);
