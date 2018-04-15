import {INCREMENT,DECREMENT,RESET} from 'actions/counter';

/*
 * 初始化state
 */
const initState = {
	count:0
}

/*
 * reducer
 */
export default function reducer(state=initState,action){
	//得到从reducers的combineReducers方法传来的action和state。根据action发生了什么来更新state，再将新的state返回。
	switch(action.type){
		case INCREMENT: 
			return{
				count:state.count + 1
			};
		case DECREMENT: 
			return{
				count:state.count - 1
			};
		case RESET: 
			return{
				count:0
			};
		default:
			return state;
	}
}