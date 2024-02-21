import {promotionRootCategoryGet} from "./promotionRootCategoryGet";
import React, {useEffect, useState} from "react";
import {promotionSubCategoriesGet} from "./promotionSubCategoriesGet";
import {validatePromotionCategory} from "./validatePromotionCategory";


const PromotionCategory = () => {

    const getSubCategories = (categoryId) => {
        return promotionSubCategoriesGet(categoryId)
    }


    //Root category manipulation
    let rootCategories = [];
    let depArrayRoot = [...rootCategories];
    const getPromotionRootCategories = () => {
        promotionRootCategoryGet(`Promotion`).then(function (json) {
            console.log("rootCategories" + JSON.stringify(json))
            rootCategories = json.items;
            depArrayRoot = [...rootCategories];
            setRootCategory(rootCategories);

        })
    }
    function changeRootCategories(event) {
        setSelectedValueRoot(event.target.value)
        let categoryId = event.target.value;
        getSubCategories(categoryId).then(function (json) {
            console.log("firstSubCategories" + JSON.stringify(json));
            firstSubCategories = json.items;
            setFirstSubCategory(firstSubCategories);
            setSecondSubCategory([]);
            setThirdSubCategory([]);
            setFourthSubCategory([]);

        })
    }
    useEffect(() => {
        getPromotionRootCategories();
    }, depArrayRoot)
    const [rootCategory, setRootCategory] = useState([])
    const [selectedValueRoot, setSelectedValueRoot] = useState('');


    //First sub-categories manipulation
    let firstSubCategories = [];
    function changeFirstSubCategories(event) {
        setSelectedValueFirst(event.target.value);
        let categoryId = event.target.value;
        getSubCategories(categoryId).then(function (json) {
            console.log("secondSubCategories" + JSON.stringify(json));
            secondSubCategories = json.items;
            setSecondSubCategory(secondSubCategories);
            setThirdSubCategory([]);
            setFourthSubCategory([]);

        })
    }
    const [firstSubCategory, setFirstSubCategory] = useState([]);
    const [selectedValueFirst, setSelectedValueFirst] = useState('');


    //Second sub-categories manipulation
    let secondSubCategories = [];
    function changeSecondSubCategories(event) {
        setSelectedValueSecond(event.target.value);
        let categoryId = event.target.value;
        getSubCategories(categoryId).then(function (json) {
            console.log("thirdSubCategories" + JSON.stringify(json));
            thirdSubCategories = json.items;
            setThirdSubCategory(thirdSubCategories);
            setFourthSubCategory([]);

        })

    }
    const [secondSubCategory, setSecondSubCategory] = useState([]);
    const [selectedValueSecond, setSelectedValueSecond] = useState('');


    //Third sub-categories manipulation
    let thirdSubCategories = [];
    function changeThirdSubCategories(event) {
        setSelectedValueThird(event.target.value);
        let categoryId = event.target.value;
        getSubCategories(categoryId).then(function (json) {
            console.log("fourthSubCategories" + JSON.stringify(json));
            fourthSubCategories = json.items;
            setFourthSubCategory(fourthSubCategories);

        })

    }
    const [thirdSubCategory, setThirdSubCategory] = useState([]);
    const [selectedValueThird, setSelectedValueThird] = useState('');


    //Fourth sub-categories manipulation
    let fourthSubCategories = [];
    function changeFourthSubCategories(event) {
        setSelectedValueFourth(event.target.value);
        let categoryId = event.target.value;
        getSubCategories(categoryId).then(function (json) {
            console.log("fourthSubCategories" + JSON.stringify(json));
        })

    }
    const [fourthSubCategory, setFourthSubCategory] = useState([]);
    const [selectedValueFourth, setSelectedValueFourth] = useState('');


    const handleSubmit = (e) => {
        e.preventDefault();
        let formData = new FormData();
        formData.append('rootCategory', selectedValueRoot);
        formData.append('firstCategory',selectedValueFirst);
        formData.append('secondCategory', selectedValueSecond);
        formData.append('thirdCategory',selectedValueThird);
        formData.append('fourthCategory', selectedValueFourth);
        validatePromotionCategory(formData).then(function (json) {
            console.log("isValid? " + JSON.stringify(json));
        })

    }

    return (<form id = "categoryForm" action="" onSubmit={handleSubmit}>
        <select id="rootCategories" aria-label="select lob" value={selectedValueRoot}
                onChange={(event) => changeRootCategories(event)}>
            {rootCategory.map(rootCategory => {
                return <option key={rootCategory.categoryId}
                               value={rootCategory.categoryId}>{rootCategory.name}</option>
            })}
        </select>
        <select id="firstSubCategories" aria-label="select promo type" value={selectedValueFirst}
                onChange={(event) => changeFirstSubCategories(event)}>
            {firstSubCategory.map(firstSubCategory => {
                return <option key={firstSubCategory.categoryId}
                               value={firstSubCategory.categoryId}>{firstSubCategory.name}</option>
            })}
        </select>
        <select id="secondSubCategories" aria-label="select promo sub-type" value={selectedValueSecond}
                onChange={(event) => changeSecondSubCategories(event)}>
            {secondSubCategory.map(secondSubCategory => {
                return <option key={secondSubCategory.categoryId}
                               value={secondSubCategory.categoryId}>{secondSubCategory.name}</option>
            })}
        </select>
        <select id="thirdSubCategories" aria-label="select discount-type" value={selectedValueThird}
                onChange={(event) => changeThirdSubCategories(event)}>
            {thirdSubCategory.map(thirdSubCategory => {
                return <option key={thirdSubCategory.categoryId}
                               value={thirdSubCategory.categoryId}>{thirdSubCategory.name}</option>
            })}
        </select>
        <select id="fourthSubCategories" aria-label="select benefit-type" value={selectedValueFourth}
                onChange={(event) => changeFourthSubCategories(event)}>
            {fourthSubCategory.map(fourthSubCategory => {
                return <option key={fourthSubCategory.categoryId}
                               value={fourthSubCategory.categoryId}>{fourthSubCategory.name}</option>
            })}
        </select>
        <button id={"submitBtn"} type={"submit"} >Submit</button>



    </form>)
}
export default PromotionCategory