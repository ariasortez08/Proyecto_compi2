declare i32 @printf(i8*, ...)   ; Para imprimir texto
declare i32 @scanf(i8*, ...)    ; Para leer texto

@.fmt = private unnamed_addr constant [4 x i8] c"%d\0A\00", align 1

@arreglo = global [50 x i32] zeroinitializer
@arreglo_bidi = global [10 x [5 x i32]] zeroinitializer
@.fmt_read0 = private unnamed_addr constant [15 x i8] c"arreglo[%d] = \00"
@.fmt_read1 = private unnamed_addr constant [4 x i8] c"%d\0A\00"
@mensaje2 = constant [26 x i8] c"Gracias por usar Pascal!\0A\00"
define i32 @f() {
entry:

	ret i32 3
}

define i32 @main() {
entry: 

	%lenght = alloca i32
	%i = alloca i32
	%j = alloca i32
	%x = alloca i32
	%y = alloca i32
	%cont = alloca i32
	store i32 50, i32* %lenght
	store i32 10, i32* %x
	store i32 5, i32* %y
	store i32 1, i32* %cont
	%x_val0 = load i32, i32* %x
	store i32 %x_val0, i32* %i
	br label %loop_cond0

loop_cond0:
	%i_val2 = load i32, i32* %i
	%cmp0 = icmp sge i32 %i_val2, 1
	br i1 %cmp0, label %loop_body0, label %loop_end0
loop_body0:
	%y_val5 = load i32, i32* %y
	store i32 %y_val5, i32* %j
	br label %loop_cond1

loop_cond1:
	%j_val7 = load i32, i32* %j
	%cmp1 = icmp sge i32 %j_val7, 1
	br i1 %cmp1, label %loop_body1, label %loop_end1
loop_body1:
	%x_load0 = load i32, i32* %x
	%y_load1 = load i32, i32* %y
	%sub0 = sub i32 %x_load0, %y_load1
	%cont_load2 = load i32, i32* %cont
	%sum1 = add i32 %cont_load2, %sub0
	%sum2 = add i32 %sum1, 5
	%mod3 = srem i32 %sum2, 15
	%i_val10 = load i32, i32* %i
	%j_val10 = load i32, i32* %j
	%arreglo_bidi_prt11 = getelementptr [10 x [5 x i32]], [10 x [5 x i32]]* @arreglo_bidi, i32 0, i32 %i_val10, i32 %j_val10
	store i32 %mod3, i32* %arreglo_bidi_prt11
	%j_val9 = load i32, i32* %j
	%dec9 = sub i32 %j_val9, 1
	store i32 %dec9, i32* %j
	br label %loop_cond1
loop_end1:
	%i_val4 = load i32, i32* %i
	%dec4 = sub i32 %i_val4, 1
	store i32 %dec4, i32* %i
	br label %loop_cond0
loop_end0:
	store i32 1, i32* %cont
	store i32 1, i32* %i
	br label %loop_cond2

loop_cond2:
	%i_val14 = load i32, i32* %i
	%x_val13 = load i32, i32* %x
	%cmp2 = icmp sle i32 %i_val14, %x_val13
	br i1 %cmp2, label %loop_body2, label %loop_end2
loop_body2:
	store i32 1, i32* %j
	br label %loop_cond3

loop_cond3:
	%j_val19 = load i32, i32* %j
	%y_val18 = load i32, i32* %y
	%cmp3 = icmp sle i32 %j_val19, %y_val18
	br i1 %cmp3, label %loop_body3, label %loop_end3
loop_body3:
	%i_valassing3 = load i32, i32* %i
	%j_valassing3 = load i32, i32* %j
	%arreglo_bidi_prt_assing3 = getelementptr [10 x [5 x i32]], [10 x [5 x i32]]* @arreglo_bidi, i32 0, i32 %i_valassing3, i32 %j_valassing3%arreglo_bidi_load_assing3 = load i32, i32* %arreglo_bidi_prt_assing3
	%cont_val14 = load i32, i32* %cont
	%arreglo_prt15 = getelementptr [50 x i32], [50 x i32]* @arreglo, i32 0, i32 %cont_val14
	store i32 %arreglo_bidi_load_assing3, i32* %arreglo_prt15
	%cont_load4 = load i32, i32* %cont
	%sum4 = add i32 %cont_load4, 1
	store i32 %sum4, i32* %cont
	%j_val21 = load i32, i32* %j
	%dec21 = add i32 %j_val21, 1
	store i32 %dec21, i32* %j
	br label %loop_cond3
loop_end3:
	%i_val16 = load i32, i32* %i
	%dec16 = add i32 %i_val16, 1
	store i32 %dec16, i32* %i
	br label %loop_cond2
loop_end2:
	store i32 1, i32* %cont
	br label %while.cond0
while.cond0:
	%cont_val0 = load i32, i32* %cont
	%lenght_load5 = load i32, i32* %lenght
	%sum5 = add i32 %lenght_load5, 1
	%cond0 =  icmp ne  i32 %cont_val0, %sum5
	br i1 %cond0, label %while.body0, label %while.end0
while.body0:
	%cont_load6 = load i32, i32* %cont
	call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([15 x i8], [15 x i8]* @.fmt_read0, i32 0, i32 0), i32 %cont_load6)
	%cont_valwritecon7 = load i32, i32* %cont
	%arreglo_ptr8 = getelementptr [50 x i32], [50 x i32]* @arreglo, i32 0, i32 %cont_valwritecon7
	%arreglo_ptr8_load8 = load i32, i32* %arreglo_ptr8
	call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.fmt_read1, i32 0, i32 0), i32 %arreglo_ptr8_load8)
	%cont_load9 = load i32, i32* %cont
	%sum6 = add i32 %cont_load9, 1
	store i32 %sum6, i32* %cont
	br label %while.cond0
while.end0:
	%msg_ptr2 = getelementptr [26 x i8], [26 x i8]* @mensaje2, i32 0, i32 0
    call i32 (i8*, ...) @printf(i8* %msg_ptr2)

	ret i32 0
}