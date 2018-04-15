export const INCREMENT = "counter/INCREMENT";
export const DECREMENT = "counter/DECREMENT";
export const RESET = "counter/RESET";

//使用 action 来描述发生了什么，使用action创建函数来返回action。
export function increment(){
	return {
		type:INCREMENT
	}
}

export function decrement(){
	return {
		type:DECREMENT
	}
}

export function reset(){
	return {
		type:RESET
	}
}