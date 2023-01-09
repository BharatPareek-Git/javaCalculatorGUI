import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Stack;
class CalculatorGui
{
	JFrame jframe;
	JTextField jtextfield1;
	JButton jbutton_0,jbutton_1,jbutton_2,jbutton_3,jbutton_4,jbutton_5,jbutton_6,jbutton_7,jbutton_8,jbutton_9,jbutton_add,jbutton_subtract,jbutton_multiply,jbutton_divide,jbutton_clear,jbutton_result;

	CalculatorGui()
	{
		jframe = new JFrame("Calculator");

		jtextfield1 = new JTextField(23);
		jtextfield1.setEditable(false);

		jbutton_0 = new JButton("  0  ");
		jbutton_1 = new JButton("  1  ");
		jbutton_2 = new JButton("  2  ");
		jbutton_3 = new JButton("  3  ");
		jbutton_4 = new JButton("  4  ");
		jbutton_5 = new JButton("  5  ");
		jbutton_6 = new JButton("  6  ");
		jbutton_7 = new JButton("  7  ");
		jbutton_8 = new JButton("  8  ");
		jbutton_9 = new JButton("  9  ");
		jbutton_add = new JButton(" + ");
		jbutton_subtract = new JButton(" -  ");
		jbutton_multiply = new JButton("  *  ");
		jbutton_divide = new JButton("  /  ");
		jbutton_clear = new JButton(" C ");
		jbutton_result = new JButton("  =  ");

		jframe.add(jtextfield1);
		jframe.add(jbutton_1);
		jframe.add(jbutton_2);
		jframe.add(jbutton_3);
		jframe.add(jbutton_clear);
		jframe.add(jbutton_4);
		jframe.add(jbutton_5);
		jframe.add(jbutton_6);
		jframe.add(jbutton_add);
		jframe.add(jbutton_7);
		jframe.add(jbutton_8);
		jframe.add(jbutton_9);
		jframe.add(jbutton_subtract);
		jframe.add(jbutton_0);
		jframe.add(jbutton_result);
		jframe.add(jbutton_multiply);
		jframe.add(jbutton_divide);

		jbutton_0.addActionListener(
										new ActionListener()
										{
											public void actionPerformed(ActionEvent ae)
											{
												String originalStr = jtextfield1.getText();
												if(originalStr.contains("ERROR"))
												{
													jtextfield1.setText("");
												}
												jtextfield1.setText(jtextfield1.getText()+"0");
											}
										}
								   );

		jbutton_1.addActionListener(
										new ActionListener()
										{
											public void actionPerformed(ActionEvent ae)
											{
												String originalStr = jtextfield1.getText();
												if(originalStr.contains("ERROR"))
												{
													jtextfield1.setText("");
												}
												jtextfield1.setText(jtextfield1.getText()+"1");
											}
										}
							       );

		jbutton_2.addActionListener(
										new ActionListener()
										{
											public void actionPerformed(ActionEvent ae)
											{
												String originalStr = jtextfield1.getText();
												if(originalStr.contains("ERROR"))
												{
													jtextfield1.setText("");
												}
												jtextfield1.setText(jtextfield1.getText()+"2");
											}
										}
								   );

		jbutton_3.addActionListener(
										new ActionListener()
										{
											public void actionPerformed(ActionEvent ae)
											{
												String originalStr = jtextfield1.getText();
												if(originalStr.contains("ERROR"))
												{
													jtextfield1.setText("");
												}
												jtextfield1.setText(jtextfield1.getText()+"3");
											}
										}
								   );

		jbutton_4.addActionListener(
										new ActionListener()
										{
											public void actionPerformed(ActionEvent ae)
											{
												String originalStr = jtextfield1.getText();
												if(originalStr.contains("ERROR"))
												{
													jtextfield1.setText("");
												}
												jtextfield1.setText(jtextfield1.getText()+"4");
											}
										}
							       );

		jbutton_5.addActionListener(
										new ActionListener()
										{
											public void actionPerformed(ActionEvent ae)
											{
												String originalStr = jtextfield1.getText();
												if(originalStr.contains("ERROR"))
												{
													jtextfield1.setText("");
												}
												jtextfield1.setText(jtextfield1.getText()+"5");
											}
										}
								   );

		jbutton_6.addActionListener(
										new ActionListener()
										{
											public void actionPerformed(ActionEvent ae)
											{
												String originalStr = jtextfield1.getText();
												if(originalStr.contains("ERROR"))
												{
													jtextfield1.setText("");
												}
												jtextfield1.setText(jtextfield1.getText()+"6");
											}
										}
								   );

		jbutton_7.addActionListener(
										new ActionListener()
										{
											public void actionPerformed(ActionEvent ae)
											{
												String originalStr = jtextfield1.getText();
												if(originalStr.contains("ERROR"))
												{
													jtextfield1.setText("");
												}
												jtextfield1.setText(jtextfield1.getText()+"7");
											}
										}
							       );

		jbutton_8.addActionListener(
										new ActionListener()
										{
											public void actionPerformed(ActionEvent ae)
											{
												String originalStr = jtextfield1.getText();
												if(originalStr.contains("ERROR"))
												{
													jtextfield1.setText("");
												}
												jtextfield1.setText(jtextfield1.getText()+"8");
											}
										}
								   );

		jbutton_9.addActionListener(
										new ActionListener()
										{
											public void actionPerformed(ActionEvent ae)
											{
												String originalStr = jtextfield1.getText();
												if(originalStr.contains("ERROR"))
												{
													jtextfield1.setText("");
												}
												jtextfield1.setText(jtextfield1.getText()+"9");
											}
										}
								   );

		jbutton_add.addActionListener(
											new ActionListener()
											{
												public void actionPerformed(ActionEvent ae)
												{
													String originalStr = jtextfield1.getText();
													if(originalStr.contains("ERROR"))
													{
														jtextfield1.setText("");
													}
													jtextfield1.setText(jtextfield1.getText()+"+");
												}
											}
							          );

		jbutton_subtract.addActionListener(
												new ActionListener()
												{
													public void actionPerformed(ActionEvent ae)
													{
														String originalStr = jtextfield1.getText();
														if(originalStr.contains("ERROR"))
														{
															jtextfield1.setText("");
														}
														jtextfield1.setText(jtextfield1.getText()+"-");
													}
												}
								  		  );

		jbutton_multiply.addActionListener(
												new ActionListener()
												{
													public void actionPerformed(ActionEvent ae)
													{
														String originalStr = jtextfield1.getText();
														if(originalStr.contains("ERROR"))
														{
															jtextfield1.setText("");
														}
														jtextfield1.setText(jtextfield1.getText()+"*");
													}
												}
								   		   );

		jbutton_divide.addActionListener(
											new ActionListener()
											{
												public void actionPerformed(ActionEvent ae)
												{
													String originalStr = jtextfield1.getText();
													if(originalStr.contains("ERROR"))
													{
														jtextfield1.setText("");
													}
													jtextfield1.setText(jtextfield1.getText()+"/");
												}
											}
							       	   );

		jbutton_clear.addActionListener(
											new ActionListener()
											{
												public void actionPerformed(ActionEvent ae)
												{
													String temp = "";
													String originalStr = jtextfield1.getText();
													
													if(originalStr.contains("ERROR"))
													{
														jtextfield1.setText("");
													}
													else if(originalStr.length() >= 1)
													{
														for(int i=0;i<originalStr.length()-1;i++)
														{
															temp += ""+originalStr.charAt(i);
														}
														jtextfield1.setText(temp);
													}
												}
											}
								   	   );

		jbutton_result.addActionListener(
											new ActionListener()
											{
												public void actionPerformed(ActionEvent ae)
												{
													try
													{
														ArrayList<String> strArrayList = new ArrayList<String>();
														Stack<String> operand = new Stack<String>();
														Stack<String> operator = new Stack<String>();

														String strTemp = "";
														String originalStr = jtextfield1.getText();
														String temp = jtextfield1.getText();
														if(originalStr.contains("ERROR"))
														{
															jtextfield1.setText("");
														}
														else if(temp.length() >= 2)
														{
															strTemp = "";
															for(int i=0;i<temp.length();i++)
															{
																char c = temp.charAt(i);
																if(c == '+' || c == '-' || c == '*' || c == '/')
																{
																	strArrayList.add(strTemp);
																	strArrayList.add(""+c);
																	strTemp = "";
																}
																else 
																{
																	strTemp += c;
																}
															}	

															if(strTemp.length()>0)
															{
																strArrayList.add(strTemp);
																strTemp = "";
															}
															if(strArrayList.size() >0 )
															{
																for(int i=0;i<strArrayList.size();i++)
																{
																	String strOperandOperator = strArrayList.get(i);

																	if(strOperandOperator.equals("+") || strOperandOperator.equals("-") || strOperandOperator.equals("*") || strOperandOperator.equals("/"))
																	{
																		if(operator.size() == 0)
																		{
																			operator.push(strOperandOperator);
																		}
																		else if(operator.size() >= 1)
																		{
																			String previousOperator = operator.peek();

																			if(previousOperator.equals("+") || previousOperator.equals("-") && strOperandOperator.equals("*") || strOperandOperator.equals("/"))
																			{
																				operator.push(strOperandOperator);
																			}
																			else if(previousOperator.equals("+") || previousOperator.equals("-") && strOperandOperator.equals("+") || strOperandOperator.equals("-"))
																			{
																				operator.push(strOperandOperator);
																			}
																			else if(previousOperator.equals("*") || previousOperator.equals("/") && strOperandOperator.equals("*") || strOperandOperator.equals("/"))
																			{
																				operator.push(strOperandOperator);
																			}
																			else if(previousOperator.equals("*") || previousOperator.equals("/") && strOperandOperator.equals("+") || strOperandOperator.equals("-"))
																			{
																				int value2 = Integer.parseInt(operand.pop());
																				String value1Temp = operand.pop();
																				int value1;
																				if(value1Temp.equals(""))
																				{
																					value1 = 0;
																				}
																				else
																				{
																					value1 = Integer.parseInt(value1Temp);
																				}

																				String operation = operator.pop();	

																				operator.push(strOperandOperator);

																				switch(operation)
																				{
																					case "+":
																						int sum = value1+value2;
																						operand.push(""+sum);
																					break;

																					case "-":
																						int sub = value1-value2;
																						operand.push(""+sub);
																					break;

																					case "*":
																						int multi = value1*value2;
																						operand.push(""+multi);
																					break;

																					case "/":
																						if(value2 !=0)
																						{
																							int divi = value1/value2;
																							operand.push(""+divi);
																						}
																						else if(value2 == 0)
																						{
																							jtextfield1.setText("ERROR");
																						}
																					break; 
																				}
																			}
																		}
																	}
																	else
																	{
																		operand.push(strOperandOperator);
																	}
																}

																while(operator.size() != 0)
																{

																	int value2 = Integer.parseInt(operand.pop());
																	String value1Temp = operand.pop();
																	int value1;
																	if(value1Temp.equals(""))
																	{
																		value1 = 0;
																	}
																	else
																	{
																		value1 = Integer.parseInt(value1Temp);
																	}
																	String operation = operator.pop();

																	switch(operation)
																	{
																		case "+":
																			int sum = value1+value2;
																			operand.push(""+sum);
																		break;

																		case "-":
																			int sub = value1-value2;
																			operand.push(""+sub);
																		break;

																		case "*":
																			int multi = value1*value2;
																			operand.push(""+multi);
																		break;

																		case "/":
																			if(value2 !=0)
																			{
																				int divi = value1/value2;
																				operand.push(""+divi);
																			}
																			else if(value2 == 0)
																			{
																				jtextfield1.setText("ERROR");
																			}
																		break; 
																	}
																}

																jtextfield1.setText(""+operand.pop());
															}
														
														}
														else if(temp.length() == 1)
														{
															if(temp.contains("+") || temp.contains("-") || temp.contains("*") || temp.contains("/"))
															{
																jtextfield1.setText("ERROR");
															}
														}
													}catch(Exception e)
													{
														jtextfield1.setText("ERROR");
													}
												} 

											}
					  				   );

		jframe.setSize(270,380);
		jframe.setVisible(true);
		jframe.setResizable(false);
		jframe.setLayout(new FlowLayout());
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[])
	{
		new CalculatorGui();
	}
}